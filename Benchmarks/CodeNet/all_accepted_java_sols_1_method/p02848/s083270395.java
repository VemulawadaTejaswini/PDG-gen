import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        String[] sp = s.split("");
        String[] al = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int i = 0; i < sp.length; i++) {
            for(int j = 0; j < 26; j++) {
                if(sp[i].equals(al[j])) {
                    if(j+N >=26) {
                        System.out.print(al[j+N-26]);
                    }else {
                        System.out.print(al[j+N]);
                    }
                    break;
                }
            }   
        }	
        System.out.println("");
	}
}