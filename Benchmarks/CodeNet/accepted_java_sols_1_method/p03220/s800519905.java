import java.util.Scanner;

public class Main{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int T = sc.nextInt();
int A = sc.nextInt();
int ans=1;
double distance=-1.0;
  for(int i=1;i<=N;i++){
    int H = sc.nextInt();
    if(distance==-1){
      ans=i;
      distance=Math.abs(A-(T-0.006*H));
    }else{
      if(distance>Math.abs(A-(T-0.006*H))){
        ans=i;
        distance=Math.abs(A-(T-0.006*H));
      }
    }

  }

System.out.println(ans);
}
}
