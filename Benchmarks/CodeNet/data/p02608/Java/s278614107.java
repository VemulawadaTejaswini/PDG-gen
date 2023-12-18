import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count[]= new int[N+1];

        for(int i=1;i<=N;i++){
            double s =(Math.sqrt(i))+1;
            for(int x=1; x<s;x++){
                for(int y=1;y<s-x+1;y++){
                    for(int z=1;z<s-x-y+1;z++){
                        
                        if(x*x + y*y + z*z + x*y + y*z + z*x == i){
                            count[i]++;
                        }
                    }

                }
            }
            System.out.println(count[i]);
        }
        

    }
}
