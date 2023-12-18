import java.util.*;

 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
 
        while (num != ""){
            int sum = 0;
 
            for(int i = 0; i < num.length(); i++){
                sum = sum + num.charAt(i) - '0';
            }
 
            System.out.printf("%d\n",sum);
            num = sc.nextLine();
        }
    }
}


    