import java.util.Scanner;


public class Main { 
       public static void main(String[] args) {
           int n; 
           String a;
           int i;
           int j;
           
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String [] [] c = new String [4] [13];
        
        while(n!=0){
            n--;
            switch(a = sc.next().toUpperCase()){
                case "S":
                  i = 0;
                  j = sc.nextInt();
                  c [i] [j-1] = a+" "+j;
                break;
                case "H":
                    i = 1;
                    j = sc.nextInt();
                    c [i] [j-1] = a+ " " + j;
                break;
                case "C":
                    i = 2;
                    j = sc.nextInt();
                    c [i] [j-1] = a+ " " + j;
                break;   
                case "D":
                    i = 3;
                    j = sc.nextInt();
                    c [i] [j-1] = a+ " " + j;
                break;   
          }
        }
          for ( i = 0; i <4; i++){
            for (j = 0; j<13; j++){
                int k = j+1;
                if( c[i][j]== null){
                switch(i){
                    case 0:
                    System.out.println("S "+ k);
                    break;
                    case 1:
                    System.out.println("H "+ k);
                    break;
                    case 2:
                    System.out.println("C "+ k);
                    break;
                    case 3:
                    System.out.println("D "+ k);
                    break;
                }
                }
                }
          }
          }
}


