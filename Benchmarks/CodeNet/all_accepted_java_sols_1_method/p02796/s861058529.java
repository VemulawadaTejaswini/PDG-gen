import java.util.*;
 
class Main {
    static int N,X,L;
    static int[][] Robot;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        Robot = new int[N][2];
        for(int i=0;i<N;i++){
            Robot[i][0] = scan.nextInt();
            Robot[i][1] = scan.nextInt();
        }
       Arrays.sort(Robot,(o1,o2)->{ //sort
        if(o1[0]==o2[0])
            return Integer.compare(o1[1], o2[1]);
        else
            return Integer.compare(o1[0], o2[0]);
       });
       int remove_cnt = 0;
       for(int i=1;i<N;i++){
            if((Robot[i-1][0]+Robot[i-1][1]) > (Robot[i][0]-Robot[i][1]) ){
                if((Robot[i-1][0]+Robot[i-1][1]) > (Robot[i][0]+Robot[i][1])){ 
                    Robot[i-1][0] = -1; Robot[i-1][1] = -1;
                }
                else{
                    Robot[i][0] = Robot[i-1][0]; Robot[i][1] = Robot[i-1][1]; 
                    Robot[i-1][0] = -1; Robot[i-1][1] = -1;
                }
                remove_cnt++;
            }
       }
       System.out.print(N-remove_cnt);
    }
}