import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
            int[] arrayS;
            arrayS = new int[N];
            int i = 0;
            for(i=0;i<N;i++){
                arrayS[i] = sc.nextInt();
            }

            int Q = sc.nextInt();
            int[] arrayT;
            arrayT = new int[Q];
            int j = 0;
            for(j=0;j<Q;j++){
                arrayT[j] = sc.nextInt();
            }

            int testdata;
            int sum;
            int counter;

            int position;
            int start;
            int end;

            sum = 0;
            for(j=0 ; j<Q ; j++ ){
            testdata = arrayT[j];
            counter=N;
            start = 0;
            end = N-1;
            position = (start+end)/2;
                    while(counter>0){
                        if(arrayS[position] == testdata){
                                sum += 1;
                                break;
                        }else{
                    if( arrayS[position] > testdata){
                        end = position-1;
                    }else{
                        start = position+1;
                    }
                    position = (start+end)/2;
                    counter /=2;
                }
            }

        }
        System.out.println(sum);
        sc.close();

    }
}
