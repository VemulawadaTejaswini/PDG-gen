import java.util.Scanner;
class Main{
 
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int max, min;
        for(int i = 0;i < 7;i++){
            max = sc.nextInt();
            min = sc.nextInt();
			int total = max - min;
            System.out.println(total);
			System.out.println();
        } 
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}