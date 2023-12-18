import Text.Printf

main = do
    r <- getDouble
    let s = r * r * pi
    let l = r * 2 * pi
    putStrLn $ printf "%.6f %.6f\n" s l

getDouble :: IO (Double)
getDouble = do
    str <- getLine
    return $ read str

