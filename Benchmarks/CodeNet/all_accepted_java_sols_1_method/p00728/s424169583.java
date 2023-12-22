import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                int n = sc.nextInt();
                if(n==0){
                    break;
                }

                int[] point = new int[n];
                int maxPoint=0;
                int maxN=0;
                int minPoint=1000;
                int minN=0;

                for(int i=0;i<n;i++){
                    point[i] = sc.nextInt();

                    if(maxPoint<point[i]){
                        maxPoint = point[i];
                        maxN = i;
                    }
                    if(minPoint>point[i]){
                        minPoint = point[i];
                        minN = i;
                    }
                }

                point[maxN] = 0;
                point[minN] = 0;

                int sum =0;
                for(int i=0;i<n;i++){
                    sum = sum + point[i];
                }

                int answer = sum/(n-2);
                System.out.println(answer);
            }
        }
    }
}
