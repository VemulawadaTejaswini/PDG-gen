import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    //1の位が0,9,8,7,6,5,4,3,2,1の順に優先して頼むのが良い
    //かかる時間はそれぞれ10で割った商+リードタイムの数
    int a1 = a%10;
    int b1 = b%10;
    int c1 = c%10;
    int d1 = d%10;
    int e1 = e%10;
    int a2 = a/10;
    int b2 = b/10;
    int c2 = c/10;
    int d2 = d/10;
    int e2 = e/10;
    int answer = (a2+b2+c2+d2+e2)*10;
    //0の数カウント
    int zeroCnt=0;
    int one[] = new int[5];
    one[0]=a1;
    one[1]=b1;
    one[2]=c1;
    one[3]=d1;
    one[4]=e1;
    for(int i=0;i<5;i++){
      if(one[i]==0){
        one[i]=10;
        zeroCnt++;
      }
    }
    //答えはmax(0,(0じゃない数-1))*10を足して、0じゃない数で一番小さい数を足したもの
    Arrays.sort(one);
    if(one[0]==10){
      one[0]=0;
    }
    answer=answer+Math.max(0,4-zeroCnt)*10+one[0];
    System.out.println(answer);
  }
  

  
}