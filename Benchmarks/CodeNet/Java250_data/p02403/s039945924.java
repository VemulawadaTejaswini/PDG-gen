import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public class rectangle{
        public int width;
        public int height;
        public  rectangle(){

        }

        public rectangle(int width, int height){
            this.width = width;
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Main main = new Main();
        List<Main.rectangle> rectanglelist = new ArrayList<>();
        while(!input.equals("0 0")){
            String[] dataset = input.split(" ");
            int H = Integer.parseInt(dataset[0]);
            int W = Integer.parseInt(dataset[1]);
            rectanglelist.add(main.new rectangle(W, H));
            input = br.readLine();
        }

        for(int i = 0;i < rectanglelist.size(); i++){
            for(int m = 1; m <= rectanglelist.get(i).height; m++){
                for(int n = 1; n <= rectanglelist.get(i).width; n++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}