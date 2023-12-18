import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner st = new Scanner(System.in);
    long sum=1L;
    long seki;
    int num= st.nextInt();
    for(int i=0;i<num;i++){
    seki= st.nextLong();
    if(sum < 1000000000000000000L) sum *= seki;
    }
    if(sum > 1000000000000000000L) System.out.println("-1");
    else System.out.println(sum);
  }
}