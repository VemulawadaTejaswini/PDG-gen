import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int ans = 0;
		int count = 0;
		
		for(int i=0; i<a.length(); i++){
		    if(a.charAt(i) == 'A' || a.charAt(i) == 'C' || a.charAt(i) == 'G' || a.charAt(i) == 'T'){
		        count++;
		        if(ans < count){
		            ans = count;
		        }
		    }else{
		        count = 0;
		    }
		}
		
		System.out.println(ans);
    }
}
