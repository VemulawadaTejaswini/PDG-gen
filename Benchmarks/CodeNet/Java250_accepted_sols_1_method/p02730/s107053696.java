import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        String s=stdIn.next();
        char[] c=s.toCharArray();
        int count1=0;
        int count2=0;
        int count3=0;
        int All=0;

        //条件1
        for(int i=0; i<c.length/2; i++){
            if(c[i]==c[c.length-1-i]){
                count1++;
            }
        }
        if(count1==(c.length-1)/2){
            All++;
        }
        //条件2

        for(int i=0; i<(c.length-1)/4; i++){
            if(c[i]==c[((c.length-1)/2)-1-i]){
                count2++;
            }
        }
        if(count2==(c.length-1)/4){
            All++;
        }
        //条件3
        for(int i=0; i<(c.length+1-(c.length+3)/2)/2; i++){
            if(c[(c.length+3)/2+i-1]==c[c.length-1-i]){
                count3++;
            }
        }
        if(count3==(c.length+1-(c.length+3)/2)/2){
            All++;
        }
        
        if(All==3){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
            
        }
        
    }

}