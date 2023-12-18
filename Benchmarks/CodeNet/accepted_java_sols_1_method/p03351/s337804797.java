import java.util.*;

class Main{

  public static void main(String args[]){
  	Scanner sc=new Scanner(System.in);
    
    int[] data=new int[4];
    
    for(int i=0;i<4;i++){
    	data[i]=sc.nextInt();
    }
    
    //直接会話できる？
    String result="No";
    
    if(Math.abs(data[0]-data[2])<=data[3]){
    	result="Yes";
    }else if(Math.abs(data[0]-data[1])<=data[3] && Math.abs(data[1]-data[2])<=data[3]){
    	result="Yes";
    }
    
    System.out.println(result);
    
  }

}
