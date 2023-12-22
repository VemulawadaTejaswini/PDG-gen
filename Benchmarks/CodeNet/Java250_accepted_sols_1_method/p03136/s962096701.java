import java.util.*;

class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = -1;
    int sum = 0;
    for(int i=0;i<n;i++){
    	int num = sc.nextInt();
      	if(max < num){max = num;}
      	sum += num;
    }
    sum -= max;
    if(max < sum){
    	System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}