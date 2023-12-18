    import java.util.*;
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int count[]= new int[N+1];

            for(int i=1;i<=N;i++){
                for(int x=1;x<100 || x<Math.sqrt(i);x++){
                    for(int y=1;y<100 || y<Math.sqrt(i);y++){
                        for(int z=1;z<100 || z<Math.sqrt(i);z++){
                            
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
