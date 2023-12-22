import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
 
	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String hoge = sc.next();
        int count = 0;
        for(int i = 0; i < hoge.length(); i++){
            if((i + 1) % 2 != 0){
                if(hoge.charAt(i) != 'R' && hoge.charAt(i) != 'U' && hoge.charAt(i) != 'D'){
                    count++;
                }
            }else{
                if(hoge.charAt(i) != 'L' && hoge.charAt(i) != 'U' && hoge.charAt(i) != 'D'){
                    count++;
                }
            }
        }
        if(count == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }     
}