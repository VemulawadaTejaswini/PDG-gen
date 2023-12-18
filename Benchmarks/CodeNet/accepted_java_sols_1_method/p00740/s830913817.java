import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sonekenichiro on 2017/06/28.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        while(true){

            String[] line = sc.nextLine().split(" ");
            int personNum = Integer.parseInt(line[0]);
            int maxStoneNum = Integer.parseInt(line[1]);


            if(personNum==0&&maxStoneNum==0){
                break;
            }


            int[] people=new int[personNum];
            Arrays.fill(people,0);


            int stoneNum=maxStoneNum;
            int personIndex=-1;

            while(true){
                for (int i =0;i<personNum;i++){
                    if(stoneNum==0){//??????????????£??????
                        stoneNum=people[i];
                        people[i]=0;

                    }else{
                        stoneNum -= 1;
                        people[i] += 1;
                    }


                    if(people[i]==maxStoneNum){//??°???????????¨??¨?????£?????????
                        personIndex=i;
                        break;
                    }
                }


                if(personIndex!=-1){
                    System.out.println(personIndex);
                    break;
                }

            }


        }//??°?????????



    }
}