import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Spade = new String[13];
        String[] Heart = new String[13];
        String[] Club = new String[13];
        String[] Daiya = new String[13];
        for (int i = 0; i < 13; i++) {
            Spade[i]="S "+(i+1);
        }
        for (int i = 0; i < 13; i++) {
            Heart[i]="H "+(i+1);
        }
        for (int i = 0; i < 13; i++) {
            Club[i]="C "+(i+1);
        }
        for (int i = 0; i < 13; i++) {
            Daiya[i]="D "+(i+1);
        }
        int maisu=scanner.nextInt();
        for(int i=0; i<maisu; i++){
            String shurui=scanner.next();
            int kazu=scanner.nextInt();
            if(shurui.equals("S")){
                Spade[(kazu-1)]="0";
            }
            else if(shurui.equals("H")){
                Heart[(kazu-1)]="0";
            }
            else if(shurui.equals("C")){
                Club[(kazu-1)]="0";
            }
            else {
                Daiya[(kazu-1)]="0";
            }   
        }
        for(int i=0; i<13; i++){
            if(!Spade[i].equals("0")){
            System.out.println(Spade[i]);
        }
        }
        for(int i=0; i<13; i++){
            if(!Heart[i].equals("0")){
            System.out.println(Heart[i]);
        }
        }
        for(int i=0; i<13; i++){
            if(!Club[i].equals("0")){
            System.out.println(Club[i]);
        }
        }
        for(int i=0; i<13; i++){
            if(!Daiya[i].equals("0")){
            System.out.println(Daiya[i]);
        }
        }
    }
}