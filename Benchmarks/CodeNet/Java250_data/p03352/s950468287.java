import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a =sc.nextInt();

        double two=Math.sqrt(a);
        double three=Math.cbrt(a);
        double four=Math.pow(a,0.25);
        double five=Math.pow(a,0.2);

        double unti[];
        unti=new double[4];
        unti[0]=Math.floor(two);
        unti[1]=Math.floor(three);
        unti[2]=Math.floor(four);
        unti[3]=Math.floor(five);
        double max=0;
        for(int i=0;i<4;i++){
             double jo=Math.pow(unti[i],i+2);
            max=Math.max(max,jo);
        }
        int ans=(int)max;
        System.out.println(ans);


        
    }
}