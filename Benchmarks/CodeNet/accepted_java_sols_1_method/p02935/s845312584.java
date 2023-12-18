import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        float total = 0;
        float f[] = new float[50];
        for(int i = 0; i < a1; i++){
            f[i] = scan.nextFloat();
            total += 1/f[i];
        }
        Arrays.sort(f);
        float vv = 0; 
        for(float i :f){
            if(i!=0){
                if(vv == 0){
                    vv= i;
                }
                else{
                    vv = (vv+i)/2;
                }
            }
        }
        
        System.out.println(vv);
    }
}
