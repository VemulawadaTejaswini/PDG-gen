import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        double[] listx = new double[N];
        double[] listy = new double[N];
        for (int i = 0; i<N; i++){
            listx[i] = Double.parseDouble(sc.next());
            listy[i] = Double.parseDouble(sc.next());
        }
        int numLine = 0;
        if((N-1)%2==0){
            numLine = (N)*(N-1)/2;
        }else{
            numLine = (N)*(N-1)/2+N/2;
        }

        double[] dist = new double[numLine];
        int count = 0;
        double distance = 0.0;
        for(int i = 0; i<N; i++){
            for(int j = i+1; j<N;j++){
                dist[count] = Math.sqrt(Math.pow(listx[i]-listx[j],2)+Math.pow(listy[i]-listy[j],2));
                distance += dist[count];
                count ++;
            }
        }
        System.out.println(distance*2/N);
    }
}
