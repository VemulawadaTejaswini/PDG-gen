import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w;
        int t;
        for(int c=1;c<=h;c++){
            t = c;
            w = c%3;
            if(w==0){
                System.out.print(" "+c);
            }else{
                while(t!=0){
                    if(t%10==3){
                        System.out.print(" "+c);break;
                    }else{
                        t/= 10;
                    }
                    
                }
            }
        }
      System.out.println();  
    }
}
