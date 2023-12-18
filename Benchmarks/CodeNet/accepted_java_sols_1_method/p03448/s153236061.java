import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    int go = 0;
    int hya = 0;
    int gozyu = 0;
    int sum = 0;
    int count = 0;
    Scanner sc = new Scanner(System.in);
    go = sc.nextInt();
    hya = sc.nextInt();
    gozyu = sc.nextInt();
    sum = sc.nextInt();
    
    int i = 0;
    int j = 0;
    int k = 0;
    for(i = 0; i <= go; i++){
        for(j = 0; j <= hya; j++){
            for(k = 0; k <= gozyu; k++){
                if(500*i+100*j+50*k==sum){
                    count++;
                }
            }
        }
    }
    System.out.println(count);
    } 
}