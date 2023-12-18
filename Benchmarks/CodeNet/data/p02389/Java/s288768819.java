import java.util.Scanner;

public class Main{
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d\n", calcRectangleArea(a, b), calcRectangleAround(a, b));
        
    }
     
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
    
    public int calcRectangleArea(int height, int width){
        return height * width;
    }
    
    public int calcRectangleAround(int height, int width){
        return (height + width) * 2;
    }
}