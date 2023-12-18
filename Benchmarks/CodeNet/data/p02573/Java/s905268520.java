import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    Integer[][] data=new Integer[2][M];
    List<List<Integer>> friends=new ArrayList<>();
    int res1=-1;
	int res2=-1;
    for(int i=0;i<M;i++){
     String[] lineData=sc.nextLine().split(" ");
	 data[0][i]=Integer.parseInt(lineData[0]);
     data[1][i]=Integer.parseInt(lineData[1]);
	 res1=res2=-1;     
     for(int j=0;j<friends.size();j++){
       if(friends.get(j).contains(data[0][i])){
         res1=j;
       }
       if(friends.get(j).contains(data[0][i])){
         res2=j;
       }
     }
     if(res1!=-1 && res2==-1){
       friends.get(res1).add(data[1][i]);
     }else if(res1==-1 && res2!=-1){
       friends.get(res2).add(data[0][i]);
     }else if(res1!=-1 && res2!=-1){
       friends.get(res1).addAll(friends.get(res2));
       friends.remove(res2);
     }else{
		List c=new ArrayList<Integer>();
       c.add(data[0][i]);
       c.add(data[1][i]);
       friends.add(c);
              
     }
    }
    int biggest=0;
	for(int i=0;i<friends.size();i++){
      if(biggest<friends.get(i).size()){
        biggest=friends.get(i).size();
      }
    }
    System.out.println(biggest);
  }
}