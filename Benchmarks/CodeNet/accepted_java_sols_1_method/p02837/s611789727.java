import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	ArrayList<ArrayList<Integer>> x=new ArrayList<>();
      	ArrayList<ArrayList<Integer>> y=new ArrayList<>();
      	for (int i=0;i<n;i++){
      		x.add(new ArrayList<Integer>());
          	y.add(new ArrayList<Integer>());
          	int size=sc.nextInt();
          	for(int j=0;j<size;j++){
            	x.get(i).add(sc.nextInt());
              	y.get(i).add(sc.nextInt());
            }
        }
      	long o=0;
      	int pow=(int)Math.pow(2,n)-1;
      	for(int i=pow;i>=0;i--){
          	boolean judge=true;          	
          	String bin = Integer.toBinaryString(i);
          	int l=bin.length();
          	int r[]=new int[n];
          	int count_one=0;	//正直者の数を数える
          	for(int j=0;j<l;j++){
             //System.out.println(bin);		
              count_one+=(int)bin.charAt(j)-48;
              r[l-1-j]=(int)bin.charAt(j)-48;
              
            }
          	for(int j=0;j<n;j++){
            	if(r[j]==1){
                  	int size=x.get(j).size();
                  	for(int k=0;k<size;k++) {  
                      	//System.out.println(bin+" "+x.get(j).get(k)+" "+y.get(j).get(k)+" "+r[x.get(j).get(k)]);
                        if(y.get(j).get(k)==r[x.get(j).get(k)-1]){
                          continue;
                        }else {
                          judge=false;
                          break;
                        }
                    }
                }
              	if(!judge)break;
            }
          if(judge&&count_one>o){
           																												
            o=count_one;
          }
        }      	
     	 System.out.println(o);
    }
}