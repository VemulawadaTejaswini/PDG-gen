import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ]
        Scanner sc = new Scanner(System.in);
        Integer countResults = sc.nextInt();
        List<String> results = new ArrayList<String>();

        for(int i= 0; i <= countResults; i++){
           results.add(sc.nextLine());
        }

        int acCount = 0;
        int waCount = 0;
        int tleCount= 0;
        int reCount = 0;

        for(String result: results){
          if(result.equals("AC")){
            acCount++;
          }
          else if(result.equals("WA")){
            waCount++;
          }
          else if(result.equals("TLE")){
            tleCount++;
          }
          else if(result.equals("RE")){
            reCount++;
          }
        }


        System.out.println("AC x " + acCount);
        System.out.println("WA x " + waCount);
        System.out.println("TLE x " + tleCount);
        System.out.println("RE x " + reCount);

	}

}
