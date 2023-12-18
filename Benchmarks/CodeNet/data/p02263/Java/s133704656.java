import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public Main() {
    }

    public static void main(String[] args ) {
    		Main main = new Main();
    		main.exec();
    }

    public void exec() {
        BufferedReader bf = null;
        try{
            bf = new BufferedReader(new InputStreamReader(System.in));
            String line = bf.readLine();
            String[] values = line.split(" ");

            MyStack mys = new MyStack();
            for( String value : values ) {
                if( "+".equals(value)) {
                    int right = mys.pop();
                    int left = mys.pop();
                    mys.push(left+right);
                } else if ( "-".equals(value) ) {
                    int right = mys.pop();
                    int left = mys.pop();
                    mys.push(left-right);
                } else if ( "*".equals(value) ) {
                    int right = mys.pop();
                    int left = mys.pop();
                    mys.push(left*right);
                } else {
                    mys.push(Integer.parseInt(value));
                }
            }

            System.out.println(mys.pop());
        } catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
        finally{
            if( bf != null ) {
                try {
					bf.close();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
            }
        }
    }

    public class MyStack {
        public static final int MAX = 1000;
        int[] values = new int[MAX];
        int index = 0;

        public MyStack() {}

        void push( int val ) {
            if( isFull() ) {
                throw new RuntimeException("MyStack is Full.");
            }

            index++;
            values[index] = val;
        }

        int pop() {
            if( isEmpty() ) {
                throw new RuntimeException("MyStack is Empty.");
            }

            index--;
            return values[index+1];
        }

        boolean isEmpty() {
            return index <= 0;
        }

        boolean isFull() {
            return index >= 1000;
        }
    }
}
