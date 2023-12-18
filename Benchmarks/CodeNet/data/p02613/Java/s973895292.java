import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a;
        int counta = 0;
        int countw = 0;
        int countt = 0;
        int countr = 0;
        for(int i = 0; i < n; i++){
            a = scan.next();
            if(a.equals("AC")){
                counta++;
            }
            if (a.equals("WA")){
                countw++;
            }
            if(a.equals("TLE")){
                countt++;
            }
            if(a.equals("RE")){
                countr++;
            }
        }
        System.out.println(counta);
        System.out.println(countw);
        System.out.println(countt);
        System.out.println(countr);



    }
}