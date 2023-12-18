import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
     	boolean approved = true;
      	for(int i = 0 ; i < n ; i++){
      		int a = sc.nextInt();
      		if((a & 1) == 0){
      			if((a % 3) != 0 && (a % 5) != 0){
      				approved = false;
      			}
      		}
        }

        System.out.println(approved ? "APPROVED" : "DENIED");
    }
}