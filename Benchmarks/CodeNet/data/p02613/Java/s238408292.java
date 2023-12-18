import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
        int i;
        String s[] = new String[n];
        int c[] = new int[4];
		for(i = 0;i < n; i++){
        	s[i] =   sc.next();
        }
      	for(i = 0;i < n; i++){
        	if(s[i].equals("AC")){
              c[0] += 1;
            }else if(s[i].equals("WA")){
              c[1] += 1;
            }else if(s[i].equals("TLE")){
              c[2] += 1;
            }else if(s[i].equals("RE")){
              c[3] += 1;
            }
        }
        System.out.println("AC" + " × " + c[0]);
        System.out.println("WA" + " × " + c[1]);
        System.out.println("TLE" + " × " + c[2]);      
        System.out.println("RE" + " × " + c[3]);     
      
    }
}