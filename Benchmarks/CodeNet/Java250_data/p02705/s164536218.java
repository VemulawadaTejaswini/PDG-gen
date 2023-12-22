public class Main {
    public static void main(String[] args) {
        int value = Integer.parseInt(readLine(255));
        System.out.printf("%f",(2*Math.PI*value));
    }

    public static  String readLine(int maxLen){
        int[] holder = new int[maxLen];
        int counter =0, reader =1;

        try{
            while(counter < maxLen){
                reader = System.in.read();
                if(reader <0 || (reader =='\n'))break;
                holder[counter++] = reader;
            }
        }catch(Exception ex){
            return (null);
        }

        if(counter ==0 && reader <0)return (null);
        return new String(holder,0,counter);
    }
}
