/*
 * SampleInputは大丈夫
 * 提出するとRUNTIMEERROR
 * 配列外参照なのか、再帰しすぎなのかはワカラン
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static int N;
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			N=cin.nextInt();
			if(N==0){
				break;
			}
			Item[] item = new Item[N];
			for(int i = 0;i<N;i++){
				String name = cin.next();
				int cost = cin.nextInt();
				map.put(name,i);
				item[i]=new Item(name,cost);
			}
			int N = cin.nextInt();
			for(int i = 0;i<N;i++){
				String name =cin.next();
				int a=cin.nextInt();
				item[map.get(name)].mix=new Item[a];
				for(int j = 0;j<a;j++){
					String s = cin.next();
					item[map.get(name)].mix[j]=item[map.get(s)];
				}
			}
			for(int i = 0;i<item.length;i++){
				//item[i].print();
			}
			Arrays.sort(item);
			for(int i = 0;i<item.length;i++){
				item[i].getMinCost();
			}
			String s = cin.next();
			for(int i = 0;i<item.length;i++){
				if(item[i].name.equals(s)){
					System.out.println(item[i].getMinCost());
				}
			}
		}

	}

}
class Item implements Comparable{
	String name;
	int cost;
	Item[] mix;
	boolean isMin;
	Item(String s,int a){
		name=s;
		cost=a;
		isMin=false;
	}
	public int compareTo(Object o){
		Item a =(Item)o;
		return this.cost-a.cost;
	}
	void print(){
		System.out.println(name);
		System.out.println(cost);
		if(mix!=null){
			for(int i = 0;i<mix.length;i++){
				System.out.println(mix[i].name);
			}
		}
		System.out.println();
	}
	int getMinCost(){
		if(isMin){
			return cost;
		}
		if(mix==null){

		}
		else{
			int sum=0;
			for(int i = 0;i<mix.length;i++){
				sum+=mix[i].getMinCost();
				if(sum>=cost){
					break;
				}
			}
			if(sum<cost){
				cost=sum;
			}
			else{

			}
		}
		this.isMin=true;
		System.out.println(name + " " + cost);
		return cost;
	}
}