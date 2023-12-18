import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();;
        
        int[][] arr = new int[4][13];
        for (int i=0; i<n; i++) {
            String str1 = scanner.next();;
            int num = scanner.nextInt();;
            
            switch(str1){
                case "S":
                    arr[0][num-1] += 1;
                    break;
                case "H":
                    arr[1][num-1] += 1;
                    break;
                case "C":
                    arr[2][num-1] += 1;
                    break;
                case "D":
                    arr[3][num-1] += 1;
                    break;
            }
        }
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++) {
                if(arr[i][j] == 0){
                    String str2 = "";
                    switch(i){
                        case 0:
                            str2 = "S";
                            break;
                        case 1:
                            str2 = "H";
                            break;
                        case 2:
                            str2 = "C";
                            break;
                        case 3:
                            str2 = "D";
                            break;
                    }
                    System.out.println(str2 + " " + Integer.toString(j+1));
                }
            }
        }     
    }
}

