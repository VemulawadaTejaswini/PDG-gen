import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int m = 0;
        int f = 0;
        int r = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        
        int stu[][] = new int[50][3];
        int goukei[] = new int[50];
        
        while(true){
            for(j=0; j<3 ;j++){
                stu[i][j] = sc.nextInt();
                if(j<2){
                    goukei[i] = goukei[i]+stu[i][j];
                }
            }
            if(i==49 || (stu[i][0]==-1 && stu[i][1]==-1 && stu[i][2]==-1 ))break;
            i++;
        }
        
        for(i=0;i<50;i++){
            if(stu[i][0] == -1 && stu[i][1] == -1 && stu[i][2] == -1)break;
            if(stu[i][0] == -1 || stu[i][1]==-1 ){
                System.out.println("F");
            }else if(80<=goukei[i]){
                System.out.println("A");
            }else if(65 <= goukei[i] && goukei[i]<80){
                System.out.println("B");
            }else if(50 <= goukei[i] && goukei[i]<65 || 50 <= stu[i][2]){
                System.out.println("C");
            }else if(30 <= goukei[i] && goukei[i]<50){
                System.out.println("D");
            }else if(goukei[i]<30){
                System.out.println("F");
            }
        }
    }
}

