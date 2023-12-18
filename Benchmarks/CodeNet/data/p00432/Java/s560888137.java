import java.util.*;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		int number, judge,area_counter,circumference;
		int x1, y1,x2,y2;
		//String[] coordinate = new String[10000];
		Scanner scan = new Scanner(System.in);
		while(true){
			ArrayList<LinkedList<Integer>> coordinateAll = new ArrayList<LinkedList<Integer>>();
			LinkedList<Integer> buf = new LinkedList<Integer>();
			for(int i=0;i<10000;i++){
				buf=null;
				coordinateAll.add(buf);
			}
			circumference=0;
			area_counter = 0;
			number = scan.nextInt();//長方形の数
			judge = scan.nextInt();//1 or 2

			if(number==0 && judge ==0){
				break;
			}
			for(int i=0;i<number;i++){
				x1 = scan.nextInt();
				y1 = scan.nextInt();
				x2 = scan.nextInt();
				y2 = scan.nextInt();
				//int y1_index;
				for(int r=x1;r<x2;r++){
					LinkedList<Integer> temp = new LinkedList<Integer>();
					if(coordinateAll.get(r)==null){
						temp.add(y1);
						temp.add(y2);
						coordinateAll.set(r, temp);
					}else{
						temp = coordinateAll.get(r);
						//System.out.print("\n 0 tempは"+temp);
						LinkedList<Integer> new_temp =new LinkedList<Integer>();
						new_temp = (LinkedList<Integer>) temp.clone();
						int endJudge =0;
						for(int j=0;j<=temp.size();j++){
							if(endJudge==1){
								break;
							}
							if(j == temp.size()){
								new_temp.add(y1);
								new_temp.add(y2);
								break;
							}else if(y1<temp.get(j)){
								if(j%2==0){
									new_temp.add(j, y1);
									temp.add(j,y1);
									j++;
								}
								for(int k=j;k<=temp.size();k++){

									//new_k++;
									if(k==temp.size()){
										new_temp.add(y2);
										endJudge++;
										break;
									}else if(y2<temp.get(k)){
										if(new_temp.size()%2==1){
											new_temp.add(j,y2);
										}
										endJudge++;
										break;
									}else{//y2>=temp.get(k)
										new_temp.remove(j);//
									}
								}
							}
						}
						//coordinateAll.remove(r);
						coordinateAll.set(r,new_temp);
					}
				}
			}
			for(LinkedList<Integer> check : coordinateAll){
				if(check!=null){
					for(int p=0;p<check.size();p=p+2){
						area_counter +=check.get(p+1)-check.get(p);
					}
				}
			}

			if(judge ==1){
				coordinateAll.clear();
				System.out.println(area_counter);
			}else{
				//int cf_counter = Circumference(coordinateAll);
				circumference = curCal(coordinateAll);
				coordinateAll.clear();
				System.out.println(area_counter+"\n"+circumference);
			}
		}
	}
//周長を求める
	private static int curCal(ArrayList<LinkedList<Integer>> coordinateAll){
		int circumference = 0;
		for(int i=0;i<coordinateAll.size();i++){
			LinkedList<Integer> check0;
			if(i==0){
				check0 =null;
			}else{
				check0 = coordinateAll.get(i-1);
			}
			LinkedList<Integer> check1 = coordinateAll.get(i);
			LinkedList<Integer> check2 = null;
			if(i==coordinateAll.size()-1){
				check2 =null;
			}else{
				check2 = coordinateAll.get(i+1);
			}
			LinkedList<Integer>mergeCheck = new LinkedList<Integer>();
			//= coordinateAll.get(i+1);
			if(check1!=null){
				circumference +=check1.size();//上と下
				if(check2==null){
					for(int c=0;c<check1.size();c=c+2){	
						circumference +=check1.get(c+1)-check1.get(c);
					}
				}
				mergeCheck.addAll(check1);
				if(check0!=null){
					mergeCheck.addAll(check0);
				}
				Collections.sort(mergeCheck);
				for(int c=0;c<mergeCheck.size();c=c+2){
					circumference +=mergeCheck.get(c+1)-mergeCheck.get(c);
				}
			}
		}
		return circumference;
	}
}