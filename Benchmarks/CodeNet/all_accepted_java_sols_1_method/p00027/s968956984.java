import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer[]> array = new ArrayList<>();
        int tmpNum;
        while((tmpNum = sc.nextInt()) != 0){
            int tmp = array.size();
            array.add(new Integer[2]);
            array.get(tmp)[0] = tmpNum;
            array.get(tmp)[1] = sc.nextInt();
        }
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(Integer[] day : array){
        	int days = day[1];
            for(int i = day[0] - 1;i >= 1;i--){
                switch(i){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                   		days += 31;
             	      	break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                       days += 30;
                       break;
                    case 2:
                       days += 29;
                       break;
                }
            }
            System.out.println(week[(days + 3) % 7]);
        }
    }
}
