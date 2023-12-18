public class Main {
    Main(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            int i = Integer.parseInt(br.readLine());
            System.out.printf("%d:%d:%d\n", i/3600, (i%3600)/60, i%60);
        }catch(IOException e) {

        }
    }

    public static void main(String[] args){
        new Main();
    }
}

