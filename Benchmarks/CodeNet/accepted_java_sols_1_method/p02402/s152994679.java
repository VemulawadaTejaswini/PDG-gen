import java.util.*;

public class Main{
    public static void main(String[] args){
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        long iNum, RiNum;
        iNum = scan.nextInt();
        long MinNum=0, MaxNum=0, SumNum=0; 
        
        for(int i=0; i<iNum; i++){
            RiNum=scan.nextInt();

            if(i==0) MinNum=MaxNum=SumNum=RiNum;
            else{
                MinNum=MinNum<RiNum ? MinNum : RiNum;
                MaxNum=MaxNum>RiNum ? MaxNum : RiNum;
                SumNum+=RiNum;
            }
        }
        System.out.println(MinNum+" "+MaxNum+" "+SumNum);
    }
}
