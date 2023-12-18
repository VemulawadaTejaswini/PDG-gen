import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class TravelingAlone{
	
	int num1;
	int state1;
	int price1;
	
	public TravelingAlone(int num, int state, int price){
		num1 = num;
		state1 = state;
		price1 = price;
	}
	
	public void changecost(int cost){
		num1 = cost;
	}
	
	public void changeprice(int price){
		price1 = price;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			
			int railNum = sc.nextInt();
			int stationNum = sc.nextInt();
			
			if(railNum == 0 && stationNum ==0){
				break;
			}
			
			int[][] rail = new int[4][railNum];
			int[][] railcost = new int[stationNum + 1][stationNum + 1];
			int[][] railprice = new int[stationNum + 1][stationNum + 1];
			TravelingAlone[] stationcost = new TravelingAlone[stationNum + 1];
			for(int i = 0; i < stationNum + 1; i++){
				for(int j = 0; j < stationNum + 1; j++){
					railcost[j][i] = Integer.MAX_VALUE;
					railprice[j][i] = Integer.MAX_VALUE;
				}
			}
			for(int i = 0; i < railNum; i++){
				rail[0][i] = sc.nextInt();
				rail[1][i] = sc.nextInt();
				rail[2][i] = sc.nextInt();
				rail[3][i] = sc.nextInt();
				railcost[rail[0][i]][rail[1][i]] = railcost[rail[1][i]][rail[0][i]] = rail[3][i];
				railprice[rail[0][i]][rail[1][i]] = railprice[rail[1][i]][rail[0][i]] = rail[2][i];
			}
			

			
			int toiawaseNum = sc.nextInt();
			int[][] toiawase = new int[3][toiawaseNum];
			
			for(int i = 0; i < toiawaseNum; i++){
				toiawase[0][i] = sc.nextInt();
				toiawase[1][i] = sc.nextInt();
				toiawase[2][i] = sc.nextInt();
			}
			
			PriorityQueue<TravelingAlone> queuecost = new PriorityQueue<TravelingAlone>(stationNum, new Comparator<TravelingAlone>() {

				@Override
				public int compare(TravelingAlone o1, TravelingAlone o2) {
					return o1.num1 - o2.num1;
				}
			});
			
			PriorityQueue<TravelingAlone> queueprice = new PriorityQueue<TravelingAlone>(stationNum, new Comparator<TravelingAlone>() {

				@Override
				public int compare(TravelingAlone o1, TravelingAlone o2) {
					return o1.price1 - o2.price1;
				}
			});
				
			int station;
			int cost;
			int price;
			int costsize;
			int pricesize;

			
			for(int ans = 0; ans < toiawaseNum; ans++){
				for(int i = 1; i <= stationNum; i++){
					stationcost[i] = new TravelingAlone(Integer.MAX_VALUE, i, Integer.MAX_VALUE);
				}
				stationcost[toiawase[0][ans]] = new TravelingAlone(0, ans + 1, 0);
				queuecost.clear();
				queueprice.clear();
				queuecost.offer(stationcost[toiawase[0][ans]]);
				queueprice.offer(stationcost[toiawase[0][ans]]);
				while(true){
					costsize = queuecost.size();
					pricesize = queueprice.size();
					if(costsize == 0 && pricesize == 0){
						break;
					}
					for(int i = 0; i < costsize; i++){
						station = queuecost.peek().state1;
						cost = queuecost.poll().num1;
						for(int j = 1; j < stationNum + 1; j++){
							if(railcost[j][station] != Integer.MAX_VALUE && stationcost[j].num1 > cost + railcost[j][station]){
								stationcost[j].changecost(cost + railcost[j][station]);
								queuecost.offer(stationcost[j]);
							}
						}
					}
					
					for(int i = 0; i < pricesize; i++){
						station = queueprice.peek().state1;
						price = queueprice.poll().price1;
						for(int j = 1; j < stationNum + 1; j++){
							if(railprice[j][station] != Integer.MAX_VALUE && stationcost[j].price1 > price + railprice[j][station]){
								stationcost[j].changeprice(price + railprice[j][station]);
								queueprice.offer(stationcost[j]);
							}
						}
					}
				}
				if(toiawase[2][ans] == 0){
					System.out.println(stationcost[toiawase[1][ans]].price1);
				}else{
					System.out.println(stationcost[toiawase[1][ans]].num1);
				}
			}
			

			
			
		}
		
	}


}