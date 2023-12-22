import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean[][] card = new boolean[4][13];
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        String m;
        int num;
        for(int i = 0; i < max; i++){
            m = scanner.next();
            num = scanner.nextInt();

            if(m.equals("S")){
                card[0][num-1] = true;
            }else if(m.equals("H")){
                card[1][num-1] = true;
            }else if(m.equals("C")){
                card[2][num-1] = true;
            }else if(m.equals("D")){
                card[3][num-1] = true;
            }
        }

        for(int i = 0; i < card.length; i++){
            for(int ii = 0; ii < card[i].length; ii++){
                if(!card[i][ii]){
                    switch (i){
                        case 0:
                            System.out.println("S " + (ii+1));
                            break;
                        case 1:
                            System.out.println("H " + (ii+1));
                            break;
                        case 2:
                            System.out.println("C " + (ii+1));
                            break;
                        case 3:
                            System.out.println("D " + (ii+1));
                            break;
                    }
                }
            }
        }
        scanner.close();
    }
}

