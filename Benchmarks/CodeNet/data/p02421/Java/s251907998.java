import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int taro = 0;
        int hanako = 0;
        
        for(int i = 0; i < n; i++){
            String tc = sc.next();
            String hc = sc.next();
            int com = tc.compareTo(hc);
            
            if(com == 0){
                taro++;
                hanako++;
            }else if(com < 0){
                hanako += 3;
            }else{
                taro +=3;
            }
        }
        System.out.println(taro + " " + hanako);
    }
}
