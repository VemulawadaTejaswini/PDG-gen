import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //HashMap<String, Integer> h = new HashMap<>();
        int[] bT = {0,0,0,0};

        while(sc.hasNext()){
            String blood = sc.next().split(",")[1];
            switch (blood){
                case "A" :
                    bT[0]++;
                    break;
                case "B":
                    bT[1]++;
                    break;
                case "AB":
                    bT[2]++;
                    break;
                case "O":
                    bT[3]++;
                    break;
            }
        }

        for(int bloodType : bT){
            System.out.println(bloodType);
        }
    }
}
