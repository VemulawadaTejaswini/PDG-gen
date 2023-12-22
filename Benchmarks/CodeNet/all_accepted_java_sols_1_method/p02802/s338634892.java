import java.util.Scanner;
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int count1 = 0;
    int count2 = 0;
    // int count3 = 0;

    boolean[] isAC = new boolean[N];
    int[] penaCount = new int[N];
    Arrays.fill(isAC,false);
    Arrays.fill(penaCount,0);

    for(int i=0; i<M; i++){
        int index = sc.nextInt()-1;
        String s = sc.next();
        if(s.equals("AC")&&isAC[index]==false){
            isAC[index]=true;
            count1++;
            count2+=penaCount[index];
        }else if(s.equals("WA")&&isAC[index]==false){
            penaCount[index]++;
        }
    }
    System.out.print(count1 + " ");  
    System.out.print(count2);  
    return;
  }
}



