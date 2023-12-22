import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArray = new String[n];
        int taroSum = 0;
        int hanacoSum = 0;
        for(int i = 0; i < n; i++){
            String a = sc.next();
            String b = sc.next();
            int result = a.compareTo(b);
            if(result == 0){
                taroSum++;
                hanacoSum++;
            }else if(result < 0){
                hanacoSum += 3;
            }else{
                taroSum += 3;
            }
        }
        System.out.println(taroSum + " " + hanacoSum);
    }
}
