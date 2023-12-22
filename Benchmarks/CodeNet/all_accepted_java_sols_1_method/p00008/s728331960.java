import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max,a,b,c,d,i,j;
        int answer = 0;;
        while(sc.hasNext()) {
            max = sc.nextInt();
            for(i = 0; i <= 18; i++) {
                for(j = 0; j <= 18; j++) {
                    if (i + j == max) {
                        for(a = i,b = 0; 0 <= a & b <= 9; a--,b++) {
                            for(c = j,d = 0; 0 <= c & d <= 9; c--,d++) {
                                if( a <= 9 & b <= 9 & c <=9 & d <= 9) {
                                	
                                    answer++;
                                }
                            }
                        }
                    }   
                }
            }
            System.out.println(answer);
            answer = 0;
        }
                     
    }
}