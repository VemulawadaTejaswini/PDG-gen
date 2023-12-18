import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sonekenichiro on 2017/07/09.
 */
public class Main {
    static final int  MIN_START_TIME=540;
    static final int MAX_TIME=720;

    static ArrayList<int[]> pcData;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true){
            String[] firstNums=scanner.nextLine().split(" ");


            int pcCount=Integer.parseInt(firstNums[0]);
            int studentCount=Integer.parseInt(firstNums[1]);
            if(pcCount==0&&studentCount==0){
                break;
            }

            pcData =new ArrayList<>();

            for(int i =0;i<pcCount;i++){
                pcData.add(new int[720]);
                Arrays.fill(pcData.get(i),0);
            }


            int dataCount=Integer.parseInt(scanner.nextLine());
            for(int i =0;i<dataCount;i++){
                String[] loginData=scanner.nextLine().split(" ");

                setLoginData(Integer.parseInt(loginData[0]),Integer.parseInt(loginData[1]),Integer.parseInt(loginData[2]),Integer.parseInt(loginData[3]));
            }



            int questionCount=Integer.parseInt(scanner.nextLine());

            for(int i =0;i<questionCount;i++){
                String[] question =scanner.nextLine().split(" ");
                int startTime=Integer.parseInt(question[0]);
                int endTime=Integer.parseInt(question[1]);
                int studentNum=Integer.parseInt(question[2]);
                int usingTime=0;

                for (int j=startTime;j<endTime;j++){
                    boolean using=false;
                    for (int k = 0;k<pcData.size();k++) {
                        if (studentNum == pcData.get(k)[j-MIN_START_TIME]) {
                            using=true;
                            break;
                        }
                    }
                    if(using){
                        usingTime++;
                    }

                }


                System.out.println(usingTime);
            }
        }



    }



    public static void setLoginData(int time,int pcNum,int studentNum,int login){
        if(login==1){
            for(int i =time-MIN_START_TIME;i<MAX_TIME;i++){
                pcData.get(pcNum-1)[i]=studentNum;
            }
        }else{
            for(int i =time-MIN_START_TIME;i<MAX_TIME;i++){
                pcData.get(pcNum-1)[i]=0;
            }
        }



    }








}