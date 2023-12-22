import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count_1=0;
      int count_2=0;
      int count_3=0;
      int count_4=0;
      String ans = "YES";
      for(int i=0;i<6;i++){
        int a = sc.nextInt();
        if(a==1){
          count_1++;
        }else if(a==2){
          count_2++;
        }else if(a==3){
          count_3++;
        }else{
          count_4++;
        }
        if(count_1>2 || count_2>2 || count_3>2 || count_4>2){
          ans="NO";
          break;
        }
      }
        System.out.print(ans);
    }
}