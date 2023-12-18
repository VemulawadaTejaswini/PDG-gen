import java.util.Scanner;

public class Main{
    
    int max;
    int min;
    int sa;
	int i=0;
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
		while(i<7){
			max = sc.nextInt();
			min = sc.nextInt();
			sa = max-min;
			System.out.println(sa);
			i++;
		}
		
    }
    
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}