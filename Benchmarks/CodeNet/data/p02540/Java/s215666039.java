import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[][] cities = new int[N][2];

        for (int i = 0; i < N*2; i++) {
          	int x = (int) Math.floor(i / 2);
            cities[x][i % 2] = scan.nextInt();
        }
      
      	for(int i = 0; i < cities.length; i++){
        	System.out.println(cities[i][0] + ", " + cities[i][1]);
        }

        for (int i = 0; i < cities.length; i++) {
            int connections = 1;
            for (int j = 0; j < cities.length; j++) {
                    if (cities[i][0] > cities[j][0] && cities[i][1] > cities[j][1]) {
                        connections += 1;
                    }
                    else if (cities[i][0] < cities[j][0] && cities[i][1] < cities[j][1]) {
                        connections += 1;
                    }
            }
            System.out.println(connections);
        }
    }
}
