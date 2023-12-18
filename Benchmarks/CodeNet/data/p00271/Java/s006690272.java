import java.util.Scanner;
public class Main{
    int high;
    int low;
    int sa;
    int cnt=0;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        high=sc.nextInt();
        low=sc.nextInt();
        while(high>=low&&-40<high&&high<40&&-40<low&&low<40&&cnt<=7){
            System.out.println(high-low);
            high=sc.nextInt();
            low=sc.nextInt();
            cnt++;
    }
    }
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve(); 
}
}