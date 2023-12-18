public class Main 
{
    public static void main(String[] args) {
        int input = 46979;
        
        int second = input % 60;
        int minutes = (input/60)%60;
        int hour = input / 3600;
        
    
        
        System.out.println (hour + ":"+minutes +":"+second );
        
    }
}