
        for(int i = 1; i <= N; i++){
            int cn = i;
            while(cn <= N) {
                k[cn]++;
                cn += i;
            }
        }