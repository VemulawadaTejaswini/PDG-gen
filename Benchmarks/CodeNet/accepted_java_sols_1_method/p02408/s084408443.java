import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[][] = new int[4][13];

        for(int i = 0; i < n; i++){
            String mark = sc.next();
            int num = sc.nextInt();

            if(mark.equals("S")){
                array[0][num - 1] = num;
            }else if(mark.equals("H")){
                array[1][num - 1] = num;
            }else if(mark.equals("C")){
                array[2][num - 1] = num;
            }else{
                array[3][num - 1] = num;
            }
        }

        String mk = "";
        for(int i = 0; i < 4; i++){
            switch(i){
                case 0:
                    mk = "S";
                    break;
                case 1:
                    mk = "H";
                    break;
                case 2:
                    mk = "C";
                    break;
                case 3:
                    mk = "D";
                    break;
            }
            for(int j = 0; j < 13; j++){
                if(array[i][j] == 0){
                    int number = j + 1;
                    System.out.println(mk + " " + number);
                }
            }
        }
    }
}
