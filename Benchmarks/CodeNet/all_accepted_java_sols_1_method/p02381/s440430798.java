import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
    int n = sc.nextInt();
    if(n==0){
        break;
    }
    int [] student;
    int sum=0;
    double ave=0,sub=0,varisum=0,vari=0;
    int i;
    student = new int[n];

    for(i=0;i<n;i++){
        student[i]=sc.nextInt();
        sum =sum+student[i];
    }
    ave = (double)sum/n;

    for(i=0;i<n;i++){
        sub = (student[i]-ave)*(student[i]-ave);
        varisum = varisum+sub;
    }

    vari = (double)varisum/n;


    System.out.printf("%f\n",Math.sqrt(vari));


}

   


    sc.close();

}

}
